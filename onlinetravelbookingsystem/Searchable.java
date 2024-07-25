/**
 * Interface for searchable items.
 */
public interface Searchable {
    /**
     * Checks if the item matches the given criteria.
     * 
     * @param criteria the search criteria
     * @return true if the item matches the criteria, false otherwise
     */
    boolean matches(String criteria);
}