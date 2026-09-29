# Pet Care Reminder System

This project was created for Assignment 3.

The project uses Bridge and Adapter design patterns.

The system has two reminder types:
- Feeding Reminder
- Medicine Reminder

The reminders can use three sender types:
- Console
- Email
- Legacy system

Bridge separates reminder types from sender types.

Adapter connects the old LegacyPetNotifier with the new ReminderSender interface.

The project also uses dynamic implementor selection.

## Run

Run Main.java and choose:

console

email

or

legacy

## Tests

JUnit 5 is used for testing.

Run tests with:

mvn test