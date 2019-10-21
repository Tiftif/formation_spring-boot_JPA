package fr.wcs.wildemo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ARTICLE")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	

	private Integer id;

	@NotBlank
	@Size(min = 1, max = 20)
	@Basic
	@Column(name="title")
	private String title;

	@NotBlank
	@Size(min = 10)
	@Column(name="content")
	@Lob
	private String content;

	public Article() {
	}

	public Article(String title, String content) {
		this();
		this.title = title;
		this.content = content;
	}
	
	public Article(Integer id, String title, String content) {
		this(title, content);
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
