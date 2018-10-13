library(ggplot2)
library(dplyr)

sort_data = read.csv('csv/sort_data.csv')

str(sort_data)

size_vector <- sort_data$Size
size_factor <- factor(size_vector)
size <- size_factor
comparison_vector_test <- sort_data$Comparison_1
comparison_factor_test <- factor(comparison_vector_test)
comparisons = factor(sort_data$Comparison_1)

swaps_vector_test <- sort_data$Swaps
swaps_factor_test <- factor(comparison_vector_test)
swaps = factor(sort_data$Swaps)


ggplot(sort_data, aes(x = size, y = comparisons, color = Name)) +
  geom_point(aes(size = size)) + 
  geom_line(aes(group = Name)) +
  ggtitle("Comparison Graph")

ggplot(sort_data, aes(x = size, y = swaps, color = Name)) +
  geom_point(aes(size = size)) + 
  geom_line(aes(group = Name)) +
  ggtitle("Swaps Graph")


  
  
