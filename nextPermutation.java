// Algorithm:
// 1 3 5 4 2   -> 1 4 2 3 5
// Linearly  traverse from back. find such a element where a[i] < a[i+1] ==> in above index 1 is that element
// Now find next element where a[i] is > the element found above. the index in our example is index 3
// Now swap the two index values the array is 1 4 5 3 2
// Last step -> reverse everything to right of index(1+1) ie. 1 4 [ 5 3 2] reverse the bracket
// therefore the ans = 1 4 2 3 5

// Intuition behind this approach- dictonary order
//    5
//  3   4
//1        2

// there is this increasing sequence everytime thus we have to replace the 
// 3 with something that makes next half increasing and first half is much more incresing
// ie. the next half the right side should be as lesser as possible and left should be as high as possible which is why we reverse

// edge case if there is no break point -
// ques = 5 4 3 2 1 -> what is next permutation ?
// here we wont do the step 1 and 2 but we will do step 3 which is reverse. ans -> 1 2 3 4 5

// Time complexity - O(N) + O(N) + O(N) = O(3N) = O(N)
// Space Complexity - O(1)
