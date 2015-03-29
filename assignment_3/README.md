Prepare a list of rules for diagnosing a failure while testing (debugging) a program coded in a traditional procedural language with object-oriented extensions. Consider such symptoms as:

Endless loop; the program never terminates
Executes base class method when it should have executed derived class method.
Fails to produce any output; unclear whether it actually executed.
Loop executes too few or too many times.
Illegal operation attempted.
Results are incorrect for a few cases.
Results are incorrect for all cases.
Results are incomplete.
A data item is being changed or destroyed with no obvious cause.
. . any other reasonably common problems you think of . .
The rule base should consist of assertions about specific symptoms and likely causes in the program code or structure. For example if the symptom is executing a loop too few times, the cause might be coding < instead of ≤ for the continuation condition or it might be starting the counter at 1 rather than 0.

Prepare the rule base in Clojure form or some rigorous alternative.
