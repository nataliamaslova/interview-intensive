Задача 6:
Спроектировать приложение букинга слота в календаре:
Календарь отображает пустые слоты на месяц
Слот можно забукать
Можно отменить букинг на слот
Календарь имеет опции - показать количество доступных к букингу часов в этом месяце 

Слот
- день int immutable
- слот int immutable
- занят/свободен boolean mutable

- book
- cancelBooking

Календарь
- List<Slot> immutable
- Количество дней immutable

- getAvailableSlots
- getAvailableHours