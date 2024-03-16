**Facade Pattern**
Main use-case of the Facade Pattern is when you have a client (think of a client as a piece of code)
That would want to use a class which is dependent on a bunch of classes,and the classes that is dependent on 
are depending on its as well, think of a clusterfuck of classes that you want to call in other words.
The whole **Facade Pattern** point is if I want to call a class that is in some form of complex functionality use case,
I want to have an easy way of calling it or an easy way of executing a somewhat difficult use case.
Long story short define a simple interface/function which will call all of those complex functions in the correct order.

The facade pattern provides a unified interface to a set of interfaces in a subsystem.

Law of demeter/Principle of least knowledge.
_Talk only to your immediate friends_, low coupling/high cohesion.
Sloppy explanation: Talk to yourself, talk to your friends, **do not** talk to your friends friends.