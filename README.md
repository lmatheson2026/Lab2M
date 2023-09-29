# Lab2M
Dean
Lucas
Nathanial

This Lab adds 6 new function to our project. They are as follows:

To use these methods, an iterator must be created inside of the main method.
This iterator can be created using .getIterator. 
EX) myArrayList.MyListIterator itr = fractionList.getIterator();

To be Coded by Dean: 
hasNext() boolean Returns true if next will not throw an exception
hasPrevious()boolean Returns true if previous will not throw an exception
These method will be used inside of the next two methods, next() and previous()

To be coded by Lucas: 
next()Fraction Returns the next object and moves the iterator forward
previous()Fraction Returns the previous object and moves the iterator backward
To put these methods to use,  use the iterator created as the one above and use 
.next or .previous. 
Ex) Fraction nxt = itr.next();

To be coded by Nathanial: 
addAll(Fraction[] frc) boolean Inserts all the Franctions from the input array
into the list just before the item that would be returned by the next call to method n
ext and after the item that would have been returned by method previous
removeAllNext()void Removes all items located after the item returned from a call to next


All these new custom Iterator methods will allow a more precise approach when using 
an iterator to travse our Arraylist. 
