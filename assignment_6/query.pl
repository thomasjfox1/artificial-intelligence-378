/*
* Wolf Goat Cabbage logic problem
* Thomas J. Fox
* 27 April 2015
*/


?- length(X,7), setof(t,wolfGoatCabbage([west,west,west,west],X),_).

/*
* The above query returns the following executed on main.pl:
*
* X = [goat, nothing, cabbage, goat, wolf, nothing, goat]
* X = [goat, nothing, wolf, goat, cabbage, nothing, goat]
*/
