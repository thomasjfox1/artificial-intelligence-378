;Thomas J. Fox
;30 March 2015

(defstruct errorCheck
  :endlessLoop      ;Endless loop; the program never terminates
  :derivedClass     ;Executes base class method when it should have executed derived class method.
  :noOutput         ;Fails to produce any output; unclear whether it actually executed.
  :loopShort        ;Loop executes too few times.
  :loopLong         ;Loop executes too many times.
  :illegalOp        ;Illegal operation attempted.
  :inaccurateSome   ;Results are incorrect for a few cases.
  :inaccurateAll    ;Results are incorrect for all cases.
  :incomplete       ;Results are incomplete.
  :dataDestroyed    ;A data item is being changed or destroyed with no obvious cause.
  )


;created a struct for each case with some of the case's symptoms as struct elements

;Endless loop; the program never terminates
(defstruct endlessLoop
  :terminationTime      ;test to see if the program does not terminate after reasonable time
  :iContinuation        ;check to see if the counter is advanced
  :conditionalsCheck    ;check to see if the conditions controlling counter are implemented properly
  )

;Executes base class method when it should have executed derived class method.
(defstruct derivedClass
  :compareClasses       ;check if executed class is same as base class
  :checkClassExists     ;check to see if derived class exists
  :checkInheritance     ;check to see if derived class inherits from base class or is different completely
  )

;Fails to produce any output; unclear whether it actually executed.
(defstruct noOutput
  :expectedOut          ;check to see if expected out is shown
  :resultOut            ;check what the result puts out
  :checkReturn          ;check return statement to see if it outputs
  )

;Loop executes too few times.
(defstruct loopShort
  :conditionalsCheck    ;check conditionals of the loop
  :checkBreak           ;check the breakpoint of the loop
  :syntax               ;make sure syntax is correct inside the loop
  )

;Loop executes too many times.
(defstruct loopLong
  :conditionalsCheck    ;check conditionals of the loop
  :checkReturn          ;check the breakpoint of the loop
  :syntax               ;make sure syntax is correct inside the loop
  )

;Illegal operation attempted.
(defstruct illegalOp
  :flags                ;check if any flags were thrown
  :syntax               ;check syntax
  )

;Results are incorrect for a few cases.
(defstruct inaccurateSome
  :syntax               ;check syntax
  :checkDataLoad        ;check to see if the data is loaded in properly
  :conditionalsCheck    ;check conditionals to see how much of data is incorrect
  )

;Results are incorrect for all cases.
(defstruct inaccurateAll
  :syntax               ;check syntax
  :checkDataLoad        ;check to see if the data is loaded in properly
  :conditionalsCheck    ;check conditionals to see how much of data is incorrect
  )

;Results are incomplete.
(defstruct incomplete
  :syntax               ;check syntax
  :leaks                ;check for memory leaks
  :checkReturn          ;check return statement
  )

;A data item is being changed or destroyed with no obvious cause.
(defstruct dataDestroyed
  :flags                ;check if any flags were thrown
  :syntax               ;check syntax
  :leaks                ;check for memory leaks
  )
