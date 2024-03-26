package lectorial03;
import java.time.LocalDate;

public class DateEntry<K extends LocalDate, V> {
	private K key;
	private V value;
	
	public DateEntry(K date, V value) {
		this.key = date;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public boolean isEqual(DateEntry<K, V> entry) {
		return this.key.equals(entry.getKey()) && this.value.equals(entry.getValue());
	}
	
	public boolean isLaterThan(DateEntry<K, V> entry) {
		return this.key.isAfter(entry.getKey());
	}
	
	public boolean isOfSameDate(DateEntry<K, V> entry) {
		return this.key.equals(entry.getKey());
	}
	
	public static void main(String[] args) {
		DateEntry<LocalDate, Double> tempEntry1 = new DateEntry<LocalDate, Double>(LocalDate.of(2023, 2, 1), 36.5);
		DateEntry<LocalDate, Double> tempEntry2 = new DateEntry<LocalDate, Double>(LocalDate.of(2023, 2, 1), 37.1);
		if (tempEntry1.equals(tempEntry2)) {
			System.out.println("The two entries are equal.");
		}
		
		if (tempEntry1.isLaterThan(tempEntry2)) {
			System.out.println("The first entry is for a later date.");
		}
		
		if (tempEntry1.isOfSameDate(tempEntry2)) {
			System.out.println("The two entries are for the same date.");
		}		
		
	}
}
