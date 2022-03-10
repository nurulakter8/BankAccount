package bankAccount;

class BlogPost

{
    private String previewTextRst;

    private String previewTextHtml;

    private String textRst;

    private String textHtml;

    // ...
    
    public BlogPost(String previewTextRst, String previewTextHtml, String textRst, String textHtml ) {
		
    	this.previewTextRst = previewTextRst;
		this.previewTextHtml = previewTextHtml;
		this.textRst = textRst;
		this.textHtml = textHtml;
	}
 
    public void setPreviewText(String rst, String html)

    {

        setPreviewTextRst(rst);

        setPreviewTextHtml(html);

    }

    public void setText(String rst, String html)

    {

        setTextRst(rst);

        setTextHtml(html);

    }

	public String getPreviewTextRst() {
		return previewTextRst;
	}



	public void setPreviewTextRst(String previewTextRst) {
		this.previewTextRst = previewTextRst;
	}



	public String getPreviewTextHtml() {
		return previewTextHtml;
	}



	public void setPreviewTextHtml(String previewTextHtml) {
		this.previewTextHtml = previewTextHtml;
	}



	public String getTextRst() {
		return textRst;
	}



	public void setTextRst(String textRst) {
		this.textRst = textRst;
	}



	public String getTextHtml() {
		return textHtml;
	}



	public void setTextHtml(String textHtml) {
		this.textHtml = textHtml;
	}


    // ...

}
