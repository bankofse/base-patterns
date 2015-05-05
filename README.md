# base-patterns

## Gateway
## Mapper
The Mapper pattern is important to engineering enterprise systems, especially
regarding legacy code integration. Often, you don't want to modify legacy code
(so you don't break it). A Mapper instance has the ability to monitor subsystems
and move data between them--all without the subsystems knowing about each other.

Furthermore, the Mapper pattern can be used to connect the Domain and Data
Source layers of an enterprise application. If the domain code or data access
code is complex, you don't want to worsen coupling by fitting the two together
where they should not fit. A Data Mapper can be used to persist changes in the
domain layer without the domain layer knowing about this. Note: a Data Mapper
would not be useful when you are using simpler data organization pattern (like
ActiveRecord).  

## Layer Supertype
## Separate Interface
## Registry
## Value Object
A Value Object is a patten that creates custom objects for a system that are similar
to primitive types. However, a Value Object typically doesn't have equality based on
identity, but rather the equality of all of its fields, or some other form of equality.
This pattern should be used whenever a simple object with this kind of situation is needed,
for example a date range instead of the default date.
## Special Case
The Special Case pattern involves some object that can have one or more special cases occur. Usually,
when there is some null case, which requires a testing block around the object's use to avoid any null
exceptions. Rather than do that, the Special Case pattern uses multiple classes that implement an
interface. The interface shows the system the same thing as the first object, but the subclasses
handle each case individually. Most of the time, there is the normal case, and then the null case
which handles the nullity within itself, but any special case can have its wn subclass to deal with
that particular case.
## Plugin
