When practicing data structures and algorithms in Java, it's essential to be familiar with various built-in functions and classes that can significantly simplify your coding. Here’s a list of important inbuilt Java functions and classes that are very useful:

### Collections Framework

1. **ArrayList**:
   - `add(element)`, `get(index)`, `size()`, `remove(index)`, `contains(element)`, `isEmpty()`

2. **LinkedList**:
   - `add(element)`, `addFirst(element)`, `addLast(element)`, `removeFirst()`, `removeLast()`, `get(index)`

3. **HashMap**:
   - `put(key, value)`, `get(key)`, `containsKey(key)`, `containsValue(value)`, `remove(key)`, `keySet()`, `values()`

4. **HashSet**:
   - `add(element)`, `remove(element)`, `contains(element)`, `isEmpty()`, `size()`

5. **PriorityQueue** (Min-Heap by default):
   - `add(element)`, `offer(element)`, `poll()`, `peek()`, `isEmpty()`, `size()`

6. **TreeMap**:
   - `put(key, value)`, `get(key)`, `firstKey()`, `lastKey()`, `floorKey(key)`, `ceilingKey(key)`

7. **TreeSet**:
   - `add(element)`, `remove(element)`, `contains(element)`, `first()`, `last()`, `floor(element)`, `ceiling(element)`

### Arrays Utility Class

- `Arrays.sort(array)`: Sorts the specified array into ascending numerical order.
- `Arrays.binarySearch(array, key)`: Searches the specified array for the specified value using the binary search algorithm.
- `Arrays.equals(array1, array2)`: Checks if two arrays are equal.
- `Arrays.fill(array, value)`: Assigns the specified value to each element of the specified array.
- `Arrays.copyOf(original, newLength)`: Copies the specified array, truncating or padding with zeros if necessary.
- `Arrays.toString(array)`: Returns a string representation of the contents of the specified array.

### String Class

- `length()`: Returns the length of the string.
- `charAt(index)`: Returns the character at the specified index.
- `substring(beginIndex, endIndex)`: Returns a new string that is a substring of this string.
- `indexOf(char)`: Returns the index within this string of the first occurrence of the specified character.
- `split(regex)`: Splits this string around matches of the given regular expression.
- `replace(oldChar, newChar)`: Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
- `equalsIgnoreCase(anotherString)`: Compares this string to another string, ignoring case considerations.
- `toCharArray()`: Converts this string to a new character array.

### Math Class

- `Math.abs(value)`: Returns the absolute value of a value.
- `Math.max(a, b)`: Returns the greater of two values.
- `Math.min(a, b)`: Returns the smaller of two values.
- `Math.sqrt(value)`: Returns the correctly rounded positive square root of a value.
- `Math.pow(a, b)`: Returns the value of the first argument raised to the power of the second argument.
- `Math.ceil(value)`: Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
- `Math.floor(value)`: Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.

### Others

- **Stack**:
  - `push(item)`, `pop()`, `peek()`, `isEmpty()`
  
- **Deque** (ArrayDeque or LinkedList):
  - `addFirst(element)`, `addLast(element)`, `removeFirst()`, `removeLast()`, `getFirst()`, `getLast()`

- **StringBuilder**:
  - `append(str)`, `insert(offset, str)`, `delete(start, end)`, `reverse()`, `toString()`

- **Random**:
  - `nextInt(bound)`, `nextDouble()`, `nextBoolean()`

### Stream API (Java 8 and above)

- **Streams for Collections**:
  - `stream()`, `filter(predicate)`, `map(function)`, `collect(Collectors.toList())`, `forEach(action)`, `sorted()`

Being proficient with these built-in functions and classes will greatly enhance your efficiency and effectiveness when solving data structure and algorithm problems in Java.