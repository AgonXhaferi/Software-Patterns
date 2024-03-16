Overall difference between abstract and the typical factory pattern
is that the factory pattern only instantiates one object, meanwhile the **_abstract_** one
instantiates multiple.

The main use case for the abstract factory pattern is when you need to make
some form of UX/UI controls available in multiple platforms.

The subtypes here being
Mac/Windows/Linux

Based off of what I'm understanding, it initializes multiple objects, 
in order to group them together and have better control of them.

I also saw another video which was a bit more implementation specific from
Derek Banas, I'm going to check this out more thoroughly though.

And make comparisons between the two videos, cause I feel that they use it a bit differently as well.

_Need to add some more code examples for this one._

Continuing on, the main difference that I see now *code wise*, is that
there's just another layer that groups of factory patterns,
and that would be that **_abstract factory_** pattern