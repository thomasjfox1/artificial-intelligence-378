/*
*  Thomas J. Fox
*  18 April 2015
*/

:- discontiguous male/1, female/1, parent/2.

male(albert).
female(victoria).
male(edward7).
female(alexandra).
female(alice).

parent(edward7, albert).
parent(edward7, victoria).
parent(alice, albert).
parent(alice, victoria).

male(george5).
female(mary1).

parent(george5, edward7).
parent(george5, alexandra).

male(edward8).
male(george6).
female(mary2).
male(henry).
male(george).
male(john).

female(ladyElizabeth).

parent(edward8, george5).
parent(edward8, mary1).
parent(george6, george5).
parent(george6, mary1).
parent(mary2, george5).
parent(mary2, mary1).
parent(henry, george5).
parent(henry, mary1).
parent(george, george5).
parent(george, mary1).
parent(john, george5).
parent(john, mary1).

female(elizabeth2).
female(margaret).

male(philip).

parent(elizabeth2, george6).
parent(elizabeth2, ladyElizabeth).
parent(margaret, george6).
parent(margaret, ladyElizabeth).

male(charles).
female(anne).
male(andrew).
male(edward).

female(diana).

parent(charles, elizabeth2).
parent(charles, philip).
parent(anne, elizabeth2).
parent(anne, philip).
parent(andrew, elizabeth2).
parent(andrew, philip).
parent(edward, elizabeth2).
parent(edward, philip).

male(william).
male(henryWales).

female(catherine).

parent(william, charles).
parent(william, diana).
parent(henryWales, charles).
parent(henryWales, diana).

male(georgeCambridge).

parent(georgeCambridge, william).
parent(georgeCambridge, catherine).


relation(X,Y) :- ancestor(A,X), ancestor(A,Y).
father(X,Y) :- male(X),parent(X,Y).
mother(X,Y) :- female(X),parent(X,Y).
son(X,Y) :- male(X),parent(Y,X).
daughter(X,Y) :- female(X),parent(Y,X).
grandfather(X,Y) :- male(X),parent(X,A),parent(A,Y).
grandmother(X,Y) :- female(X),parent(X,A),parent(A,Y).
aunt(X,Y) :- female(X),sister(X,maleParent),mother(femaleParent,Y).
aunt(X,Y) :- female(X),sister(X,femaleParent),father(maleParent,Y).
uncle(X,Y) :- brother(X,paren),parent(paren,Y).
cousin(X,Y) :- uncle(unc, X),father(unc,Y).
ancestor(X,Y) :- parent(X,Y).
ancestor(X,Y) :- parent(X,A),ancestor(A,Y).
brother(X,Y) :-  male(X),parent(A,X),parent(A,Y), X \= Y.
sister(X,Y) :- female(X),parent(A,X),parent(A,Y), X \= Y.
