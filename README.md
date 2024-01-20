
# LeetCode Challenge D35
## Achievements
[![image.png](https://i.postimg.cc/5ytMhb1X/image.png)](https://postimg.cc/JDSgJws8)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [674. Longest Continuous Increasing Subsequence](https://leetcode.com/problems/longest-continuous-increasing-subsequence/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given an unsorted array of integers  `nums`, return  _the length of the longest  **continuous increasing subsequence**  (i.e. subarray)_. The subsequence must be  **strictly**  increasing.

A  **continuous increasing subsequence**  is defined by two indices  `l`  and  `r`  (`l < r`) such that it is  `[nums[l], nums[l + 1], ..., nums[r - 1], nums[r]]`  and for each  `l <= i < r`,  `nums[i] < nums[i + 1]`.

**Example**

> **Input:** nums = [1,3,5,4,7]
> 
>**Output:** 3
> 
>**Explanation:** The longest continuous increasing subsequence is [1,3,5] with length 3. Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element 4.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The algorithm employs a linear scan through the array, maintaining two variables: `count` and `maxLength`. The `count` variable represents the length of the current increasing subsequence, initialized to 1 for the first element. The `maxLength` variable keeps track of the maximum length encountered so far. The algorithm compares consecutive elements, incrementing `count` if the current element is less than the next one. If a non-increasing sequence is encountered, `count` is reset to 1, ensuring a fresh start for a potential new increasing subsequence. The `maxLength` is updated with the maximum value between its current value and the current `count`. The final result returned is the length of the longest continuous increasing subsequence (`maxLength`).
