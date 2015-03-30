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


(defstruct endlessLoop
  :terminationTime
  :iContinuation
  :conditionalsCheck
  )

(defstruct derivedClass
  :compareClasses
  :checkClassExists
  :checkInheritance
  )


(defstruct noOutput
  :expectedOut
  :resultOut
  :checkReturn
  )


(defstruct loopShort
  :conditionalsCheck
  :checkReturn
  :syntax
  )


(defstruct loopLong
  :conditionalsCheck
  :checkReturn
  :syntax
  )


(defstruct illegalOp
  :flags
  :syntax
  )


(defstruct inaccurateSome
  :syntax
  :checkDataLoad
  :conditionalsCheck
  )


(defstruct inaccurateAll
  :syntax
  :checkDataLoad
  :conditionalsCheck
  )

(defstruct incomplete
  :syntax
  :leaks
  :checkReturn
  )

(defstruct dataDestroyed
  :flags
  :syntax
  :leaks
  )
