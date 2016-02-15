def select_elements_starting_with_a(array: List[String]): List[String] = {
    array.filter(_.startsWith("a"))
}

def select_elements_starting_with_vowel(names: List[String]): List[String] = {
    names.filter(y => (y.startsWith("a") || y.startsWith("e") || y.startsWith("i") || y.startsWith("o") || y.startsWith("u")))
}

def remove_nils_from_array(array: List[Any]): List[Any] = {
    array.filter(_ != null)
}

def remove_nils_and_false_from_array(array: List[Any]): List[Any] = {
    remove_nils_from_array(array).filter(_ != false)
}

def reverse_every_element_in_array(array: List[String]): List[String] = {
    array.map(_.reverse)
}

def every_possible_pairing_of_students(array: List[String]): List[List[String]] = {
    array.combinations(2).toList
}

def all_elements_except_first_3(array: List[Int]): List[Int] = {
	array.takeRight(array.length - 3)
}

def add_element_to_beginning_of_array(array: List[Int], number: Int): List[Int] = {
    number :: array
}

def array_sort_by_last_letter_of_word(array: List[String]): List[String] = {
    array.sortBy(_.last)
}

def get_first_half_of_string(string: String) = {
	string.take((string.length / 2.0).ceil.toInt)
}

def make_numbers_negative(number: Int) = {
	-number.abs
}

def separate_array_into_even_and_odd_numbers(array: List[Int]): List[Int],List[Int] = {
	array.partition(_ % 2 == 0)
}

def number_of_elements_that_are_palindromes(array: List[String]): Int = {
 	array.filter(_ == _.reverse).length
}

def shortest_word_in_array(array: List[String]) = {
 	array.min
}
    
def longest_word_in_array(array: List[String]) = {
	array.max	
}

def total_of_array(array: List[Int]): Int = {
	array.reduce(_+_)
}

def double_array(array: List[Int]) = {
	array:::array
}

def average_of_array(array: List[Int]): Int = {
	total_of_array(array) / array.length
}

def get_elements_until_greater_than_five(array: List[Int]) = {
	array.take(6)
}
   
def get_all_letters_in_array_of_words(array: List[String]) = {
	array.flatMap(_.split("")).sorted.filterNot(x => x.isEmpty)
}

def swap_keys_and_values_in_a_hash(hash: scala.collection.mutable.Map[String, String]) = {
	hash.map{case (key,value) => (value,key)}
}

def add_together_keys_and_values(hash: scala.collection.mutable.Map[String, String]): Int = {
	hash.map {case (key, value) => (key + value)}.reduce(_+_)
}




