Invoker **invokes** commands, commands are associated to a receiver.
The receiver then acts upon the commands.

It would be good to make comparisons between the command and the observer pattern,
taking into consideration that both of them have a part of their pattern that has a
"listener" of sorts.
Another pattern where its worth making comparisons with is the strategy pattern,
since technically speaking the commands can be taken into consideration as "**strategies**"


The command design pattern is a behavioral design pattern used in programming to encapsulate a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations. It helps in decoupling the sender of a request from the receiver.
One of the major pros of using the command pattern is **chaining**,
you could chain multiple commands, and if one of them fails then the whole
chain can revert.
Every command has its own implementation of what to do and its reverse.
