Makes two interfaces that are initially incompatible, compatible.  
The adapter pattern converts the interface of a class to another interface that the clients expect.
Adapter lets the classes work together, that couldn't otherwise because of incompatible interfaces.

Food for thought, this is probably the "adapters" that you have in hexagonal domain driven design.
Meaning it's just an implementation of the "target interface" that the core layer uses to interact with the infrastructure layer.

And the **Adapter** communicates with an **Adaptee**.