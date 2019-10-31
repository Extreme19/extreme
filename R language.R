#data analytics

getwd()

setwd("C:\Users\Josh (Extreme)\Documents\EXTREME R")

library (dplyr)
library(ggplot2)

datasets::mtcars

install.packages("ggplot2")

View(mtcars)
summary(mtcars)
table(mtcars$am)
#Tidycase

summary(mtcars)

#select the column from mtcars
sample_mtcars <- select(mtcars, am, cyl, mpg)
View(mtcars)
table(mtcars$am)


summary(mtcars)
View(sample_mtcars)

#filter the ssample dataset
sample_mtcars <- filter(sample_mtcars, am =="0")
head(sample_mtcars)

#create a new column
#mutate creates a new column consumption
sample_mtcars <- mutate(sample_mtcars, consumption = mpg * 0.425)
View(sample_mtcars)

#group with cylinder
sample_mtcarsEDA <- group_by(sample_mtcars, cyl)
View(sample_mtcarsEDA)
head(sample_mtcarsEDA)

#summarize the table
sample_mtcarsEDA <- summarise(sample_mtcarsEDA, Avg.cons. = mean(consumption))
head(sample_mtcarsEDA)

finaloutput <- as.data.frame(sample_mtcarsEDA)
head(finaloutput)

#to export your data
write.csv(finaloutput, file = "avg.consumption.csv", row.names = TRUE)
write.csv(finaloutput, file = "avg.consumption.csv", row.names = FALSE)



#visualization(to plot)
dam <- ggplot(mtcars, aes(x=am)) + geom_bar(fill= "dark blue") + ggtitle("count of transmission type") + xlab("transmission type") + ylab("number of cars")
dam

dem2 <- ggplot(mtcars) + aes(x=mpg, y=am, colour = gear) + geom_point() + geom_smooth(method = lm)
dem2


dem3 = ggplot(mtcars) + aes(x=mpg, y=cyl) + geom_point()
dem3

