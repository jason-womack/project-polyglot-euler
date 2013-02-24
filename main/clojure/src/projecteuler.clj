(ns projecteuler)

(apply + (for [i (range 1000) :when (or (zero? (mod i 3)) (zero? (mod i 5)))] i))