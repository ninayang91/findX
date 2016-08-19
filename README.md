# findX
findX in N*N Matrix(Sorted)
//The input is an N*N matrix of numbers that is already in memory 

//each individual row is increasing from left to right

//each individual column is increasing from top to bottom

//give an algorithm that decides if a number X is in the matrix

//Sequential search for each element O(N^2)

//Binary Search for each row of column O(NlgN)

//More efficient way O(N),

//From left-bottom element if Y>X, eliminate bottom row, if Y<X, eliminate left column
