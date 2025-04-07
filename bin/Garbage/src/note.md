## Garbage collection(GC) in java.

- uses heap data structure
- erases the object to free-up the space

- JVM clears the memory

1. can make variable null
2. re-locate the object to make it un-reachable
3. by using methods we can clear the garbage

We have multiple GC

1. Eden
   - if creates a new object then object will be kept here, also known for newly created objects.
2. Survived
   - runs for few times then it will be stored here
3. Old
   - if the GC run several times. JVM will think that it is important.

Garbage Collector(GC)

- Minor GC ( Eden, Survived ) [less time complexity as comparison to major GC]
- Major GC ( Old ) [more time complexity and is costly]
  -This gc pause all the operations until all GCs' are cleared

## Versions of Garbage Collections

- G1GC(default)
  -modern performance
  -works for multiple as well as single
  -takes less memory as compared to parallel Gc but takes more time
- Serial GC
  -cannot utilize multiple cores
  -very less response time
- Parallel GC
  -can utilize multiple cores i.e. throwput

-Xms256m (Minimum heap size) -Xmx256m (Maximum heap size) where m is mb

... -XX: +PrintGCDetails
