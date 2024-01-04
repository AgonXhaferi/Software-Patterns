Initially what is mentioned in the beginning of the video is changing the behavior
of a class at runtime.
The main essence of the decorator pattern is adding multiple layers on an object, 
keep in mind by layers it just means that the main object (think of it as the core layer)
is going to be wrapper by a fuckton of other objects.

The decorator **has** a component and **is** a component.
What is meant by this is that the decorator **could** be wrapper by another decorator,
and a decorator is wrapping another decorator.

Definition from the book:
The decorator pattern attaches additional responsibilities to an object. *That is mainly
done through the **decorators***. 
Use composition instead of inheritance for sharing behavior.

At first, he mentions one class for all the coffee subtypes/types, and this would lead to class explosion

Second bad example is using multiple booleans. You'll have a fuckton of flags.

Returning booleans will invoke additional conditions in your program.
Open/Closed principle and Interface Segregation Principle isn't being followed.

After its shown that the previous implementations are just straight up bad for this use-case,
the decorator pattern is introduced.


After the implementation is finished keep in mind its over-engineered, you could just
make a list of decorators and just sum that up.


The example from the book is related to java streams/ InputStreams LineNumber -> Buffer -> FileInputStream etc etc,
we could look into this. (ask chatGPT about this.)
