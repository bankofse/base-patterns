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
## Special Case
## Plugin
