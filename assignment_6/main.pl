/*
* Wolf Goat Cabbage logic problem
* Thomas J. Fox
* 27 April 2015
*/

swap(east,west).
swap(west,east).

transport([X,Wolf,Goat,X],cabbage,[Y,Wolf,Goat,Y]) :- swap(X,Y).
transport([X,Wolf,Goat,Cabbage],nothing,[Y,Wolf,Goat,Cabbage]) :- swap(X,Y).
transport([X,X,Goat,Cabbage],wolf,[Y,Y,Goat,Cabbage]) :- swap(X,Y).
transport([X,Wolf,X,Cabbage],goat,[Y,Wolf,Y,Cabbage]) :- swap(X,Y).

equals(X,WWW,X).
equals(X,X,WW).

legal([Man,Wolf,Goat,Cabbage]) :- equals(Man,Goat,Wolf), equals(Man,Goat,Cabbage).

wolfGoatCabbage([east,east,east,east],[]).

wolfGoatCabbage(Config,[FirstMove|OtherMoves]) :- transport(Config,FirstMove,NextConfig), legal(NextConfig), wolfGoatCabbage(NextConfig,OtherMoves).
