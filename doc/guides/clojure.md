# Clojure

## History

## Concepts

## Syntax

> Making Java fun...

> Syntax Function Data

Clojure recognizes two kinds of structures...

1. Literal representations of data structures
2. Operations

3. form

4. expression

5. evaluates

6. value

prefix notation

`(operator operand1 operand2 ... operandn)`

`(my-function arg1 arg2)`

> Clojure treats commas as white space

### REPL

> **Read-Eval-Print-Loop**

> The notion of "code is data" is difficult to grasp at first.

## Tooling

## Editors

## JVM

## EDN

## LISP

# Language

# Data Types

> Code is data.

## Scalars

- Integers
- Floats
- Rationals
- Symbols
- Keywords
- Strings
- Characters
- Booleans
- Regex patterns

### Boolean

`true` or `false`

### Nothing

`nil`

### numbers

> Numbers are so fundamental it's not even funny!

## Collections

### Lists

### Sets

### Arrays

# Functions

`=`

```clojure
(= true true)
;; => true
```

`str`

# Control Flow

> if do and when

## if

```clojure
(if true
    "This string will be evaluated"
    "This string will not be evaluated")
;; => "This string will be evaluated"
```

```clojure
(if false
    "This string will be evaluated"
    "This string will not be evaluated")
;; => "This string will not be evaluated"
```

```clojure
(if false
    "By Odin;s Elbow!")
;; => nil
```

> each branch can only have one form... We get around this with the `do` form

> ## do

## when

> Clojure uses the Boolean operators or and and. or returns either the first truthy value or the last value. and returns the first falsey value or, if no values are falsey, the last truthy value.

## Valid Clojure Expressions

- Numbers
- Symbols
- Keywords
- Boolean's
- Characters
- Functions
- Function Calls
- Macros
- Strings
- Literal Maps
- Vectors
- Queues
- Records
- Sets

Some expressions are self evaluating...

- numbers
- strings
- keywords

You can write source comments, by marking the beginning of a line with a semicolon (;).)
