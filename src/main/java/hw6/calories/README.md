Задача 7:
Спроектировать приложение по подсчету калорий за день:
Приложение отображает: съеденные блюда и суммарное количество калорий за день  
Можно добавлять и удалять блюдо
Можно получать среднее количество калорий, которое было съедено в день на 
основании данных за прошлые дни.

Dish
- name String imm
- calories int imm

- display info toString

DayCalories
- list of dishes list<Dish>

- add dish addDish()
- remove dish removeDish()
- get total calories per day getTotalCalories()
- display dishes and calories

CaloriesHistory
- list of days with calories

- add data
- get average calories