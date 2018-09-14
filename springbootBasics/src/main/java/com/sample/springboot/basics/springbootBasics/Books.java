package com.sample.springboot.basics.springbootBasics;

public class Books {

	public Books(int version, String author, String textFont) {
		super();
		this.version = version;
		this.author = author;
		this.textFont = textFont;
	}

	int version;

	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the textFont
	 */
	public String getTextFont() {
		return textFont;
	}

	/**
	 * @param textFont the textFont to set
	 */
	public void setTextFont(String textFont) {
		this.textFont = textFont;
	}

	String author;
	String textFont;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Books [version=" + version + ", author=" + author + ", textFont=" + textFont + "]";
	}
	

}
