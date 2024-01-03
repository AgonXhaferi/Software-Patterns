The overall example that the instructor is giving is that
there is a weather data station  and that there is a subscriber or 
a display that wants to listen to the data and changes to the data from the station

Push vs Poll,
Going from a Poll architecture to a Push architecture.

* Polling -> The subscriber asks for changes in specific time intervals
* Pushing -> The displayer/subject notifies the subscriber that changes have been made.

To further elaborate on **pushing**, The observable (subject) notifies the subscribers 
(listeners for any and all changes that may occur).

**From the book**:
The Observer pattern defines a one-to-many relationship, so that when 
one object changes state all of its dependencies are notified and updated automatically

*There's no one implementation of the observer pattern, 
the one we're going to implement isn't strictly **THE** observer pattern.*

In my example keep in mind I'm technically speaking violating the Single Responsibility Principle.
Due to the fact that I have an IObservableValues interface, I'm adding additional get/set functions for setting the number
and the update method on the Observer classes doesn't update anything inherently, it just outputs the value that was updated 
in the observable.

In the example online his implementation isn't generic due to the fact that he relies on concrete class when creating an IObserver.
But due to that he isn't violating the SRP.
