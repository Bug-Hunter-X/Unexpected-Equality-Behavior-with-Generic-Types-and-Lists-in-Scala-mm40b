# Unexpected Equality Behavior with Generic Types and Lists in Scala
This example demonstrates a common pitfall in Scala when dealing with generic types and mutable collection types like Lists.  The issue arises from Scala's structural equality, which may not produce the expected results when comparing reference types.

## Problem

In the `MyClass` class, the `myMethod` attempts to compare a list passed as argument with a list stored as a member variable. The comparison will return false even if the lists have the same elements. This is because `==` for lists compares references, not the contents of the lists. 

## Solution

To solve this issue, you can use methods that compare list content (e.g., `sameElements` in this example), ensuring the comparison is based on structural equality of lists and avoids problems arising from reference equality.