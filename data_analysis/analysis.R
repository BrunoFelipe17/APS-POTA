library(ggplot2)
library(dplyr)

sort_data = read.csv('csv/average.csv')

str(sort_data)
print("Oi")

size_vector <- sort_data$Size
size_factor <- factor(size_vector)
size <- size_factor
comparison_vector_test <- sort_data$Comparison_average
comparison_factor_test <- factor(comparison_vector_test)
comparisons = factor(sort_data$Comparison_average)

swaps_vector_test <- sort_data$Swaps_average
swaps_factor_test <- factor(comparison_vector_test)
swaps = factor(sort_data$Swaps_average)


ggplot(sort_data, aes(x = size, y = comparisons, color = Name)) +
  geom_point(aes(size = size)) + 
  geom_line(aes(group = Name)) +
  ggtitle("Comparison Graph")

ggplot(sort_data, aes(x = size, y = swaps, color = Name)) +
  geom_point(aes(size = size)) + 
  geom_line(aes(group = Name)) +
  ggtitle("Swaps Graph")

size_5_comp <- sort_data %>%
  filter(Size == 5) %>%
  select(-c(Swaps_average))

ggplot(size_5_comp, aes(x = Name, y = Comparison_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Comparison size 5")
  
size_5_swap <- sort_data %>%
  filter(Size == 5) %>%
  select(-c(Comparison_average))

ggplot(size_5_swap, aes(x = Name, y = Swaps_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Swaps size 5")
  
  
size_10_comp <- sort_data %>%
  filter(Size == 10) %>%
  select(-c(Swaps_average))

ggplot(size_10_comp, aes(x = Name, y = Comparison_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Comparison size 10")

size_10_swap <- sort_data %>%
  filter(Size == 5) %>%
  select(-c(Comparison_average))

ggplot(size_10_swap, aes(x = Name, y = Swaps_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Swaps size 10")



size_50_comp <- sort_data %>%
  filter(Size == 50) %>%
  select(-c(Swaps_average))

ggplot(size_50_comp, aes(x = Name, y = Comparison_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Comparison size 50")

size_50_swap <- sort_data %>%
  filter(Size == 50) %>%
  select(-c(Comparison_average))

ggplot(size_50_swap, aes(x = Name, y = Swaps_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Swaps size 50")



size_100_comp <- sort_data %>%
  filter(Size == 100) %>%
  select(-c(Swaps_average))

ggplot(size_100_comp, aes(x = Name, y = Comparison_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Comparison size 100")

size_100_swap <- sort_data %>%
  filter(Size == 100) %>%
  select(-c(Comparison_average))

ggplot(size_100_swap, aes(x = Name, y = Swaps_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Swaps size 100")



size_1000_comp <- sort_data %>%
  filter(Size == 1000) %>%
  select(-c(Swaps_average))

ggplot(size_1000_comp, aes(x = Name, y = Comparison_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Comparison size 1000")

size_1000_swap <- sort_data %>%
  filter(Size == 1000) %>%
  select(-c(Comparison_average))

ggplot(size_1000_swap, aes(x = Name, y = Swaps_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Swaps size 1000")



size_10000_comp <- sort_data %>%
  filter(Size == 10000) %>%
  select(-c(Swaps_average))

ggplot(size_10000_comp, aes(x = Name, y = Comparison_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Comparison size 10000")

size_10000_swap <- sort_data %>%
  filter(Size == 10000) %>%
  select(-c(Comparison_average))

ggplot(size_10000_swap, aes(x = Name, y = Swaps_average , color = Name)) +
  geom_bar(stat = 'identity', width=0.3, aes(fill = Name)) +
  ggtitle("Swaps size 10000")