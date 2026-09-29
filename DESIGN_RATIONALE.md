# Design Rationale

## Pet Care Reminder System

My project is a Pet Care Reminder System.

The system has different types of reminders for pet owners. I implemented FeedingReminder and MedicineReminder.

The reminders can use different ways to send messages. The system supports ConsoleReminderSender, EmailReminderSender and LegacyReminderAdapter.

## Bridge Pattern

I used Bridge to separate reminder types from sender types.

PetReminder is the abstraction.

FeedingReminder and MedicineReminder are refined abstractions.

ReminderSender is the implementor interface.

ConsoleReminderSender, EmailReminderSender and LegacyReminderAdapter are implementations.

Because of Bridge, a new reminder type can be added without changing sender classes. A new sender can also be added without changing reminder classes.

## Adapter Pattern

The project has an old class called LegacyPetNotifier.

It is incompatible with ReminderSender.

ReminderSender uses:

send(String message, int petId)

LegacyPetNotifier uses:

sendOldAlert(int petId, long time, String text)

The legacy class also returns error codes instead of throwing ReminderException.

LegacyReminderAdapter converts the new method call to the old method call. It also converts legacy error codes into ReminderException.

LegacyPetNotifier is not modified.

## Why Both Patterns Are Needed

Bridge separates reminder types from sender types.

Adapter allows the incompatible LegacyPetNotifier to work as a ReminderSender implementation.

Bridge alone cannot make LegacyPetNotifier compatible with ReminderSender.

Adapter alone does not separate reminder types from sender types.

## Complexity Module

I selected Dynamic Implementor Selection.

The user enters console, email or legacy when the program runs.

ReminderSenderFactory selects the implementation based on the user input.

## Limitation

The current system only simulates sending reminders.

For example, EmailReminderSender prints the message instead of sending a real email.