# base-patterns

## Gateway

The Gateway pattern allows programs to access data or resources which are not
necessarily object-oriented code or in-memory data structures. These resources
are presented as APIs. For instance, a row data gateway provides an API over
data returned from SQL queries.

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

Enterprise applications are organized into layers. Sometimes, it is useful for
each class within a layer to inherit from a "layer supertype". This supertype
holds state or behaviour that each class in the layer needs to have. For
instance, classes within a layer may be differentiated by a common id. Or, 
in an active record--based domain layer, each class may need to share common
database access code.

In our Layer Supertype example, we construct an example presentation layer
having a button and a text field. Each of these UI objects needs to tell the
layout manager where its top left corner is located. The Layer Supertype ensures
each UI compnent in the presentation layer has this ability.

## Separate Interface

The separate interface pattern allows you to isolate packages that do not 
normally depend on each other. In some edge cases, packages *will* rely on 
each other. For instance, the domain package relies on the data mapper package
to store its data. The interface implementation lies in the other package, 
whereas the interface itself lies in the package using the other.

## Registry

If you have many objects spread thorughout your application it may become
difficult to discover or recover these objects. A registry provides a central
location in which to store object references or ids. Components of the
application wishing to use objects of a certain type may query the registry to
find them.

## Value Object

A Value Object is a patten that creates custom objects for a system that are
similar to primitive types. However, a Value Object typically doesn't have
equality based on identity, but rather the equality of all of its fields, or
some other form of equality.  This pattern should be used whenever a simple
object with this kind of situation is needed, for example a date range instead
of the default date.

## Special Case 

The Special Case pattern involves some object that can have one or more special
cases occur. Usually, when there is some null case, which requires a testing
block around the object's use to avoid any null exceptions.  Rather than do
that, the Special Case pattern uses multiple classes that implement an
interface. The interface shows the system the same thing as the first object,
but the subclasses handle each case individually. Most of the time, there is the
normal case, and then the null case which handles the nullity within itself, but
any special case can have its wn subclass to deal with that particular case.

## Plugin

The Separate Interface pattern is especially useful in situations where you have
specific functionality wrapped between objects. Their dependancies are ensured
by the interface, which can be used from inside various packages around the
system.

## Record Set

The Record Set pattern allows you to manipulate the results of SQL queries 
within an in-memory data structure.

## Service Stub

The service stub pattern allows you to substitute an enterprise service
that your application uses with a simple stubbed version for testing
purposes. For instance, if your bank uses a currency conversion api, and you
don't want to test the api itself while testing your application, you may
add a stub that returns canned currency conversion results.
