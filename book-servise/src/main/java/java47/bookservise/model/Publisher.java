package java47.bookservise.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "publisherName")
@Entity
@Table(name = "PUBLISHER")
public class Publisher implements Serializable {

	
	private static final long serialVersionUID = 1651504202076165674L;
	@Id
	String publisherName;
	@OneToMany(mappedBy = "publisher")
	Set<Book> books;

	public Publisher(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public String toString() {
		return publisherName;
	}

}
