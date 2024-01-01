Make a family of algorithms and make them interchangeable
All of these algorithms/functionalities are plug in play.
None of the algorithms depend on one another.
When one of the clients is using the algorithm, in the process of him using the algorithm,
and that given algorithm changes, the client does not need to change.
One example is using a sorting algorithm,
list.sort() for example, imagine you inject the sorting strategy, for the sorting algorithm,
the algorithm could then plug and play with different strategies.

Don't forget about is-a (White arrow.), and has-a arrows (Black arrows).

The issue with the initial example with the ducks is the following,
there are already some implementations in the base DUCK class, and some other ducks override those implemtations
with other implementations that may be used among other subtypes of ducks, meaning the overall implementation
on the abstract duck class is not all that valid, and code would be duplicated for that exact behavior type.

**Sandy Mats, look into her.**

Interesting saying, the solution to problems with inheritance, is not more inheritance.

Okay so following on with the example, the *subtypes* are so-called clients,
that would be the mountain/rubber/city ducks, instead of relying on the main methods of the Duck class, 
we are going to make strategies for those behaviors (here comes the plug and play part).

After the strategies are properly defined, the main duck class does not have need for subtypes,
it can just plug and play the different strategies in order to inherently "become" one of the other
ducks.