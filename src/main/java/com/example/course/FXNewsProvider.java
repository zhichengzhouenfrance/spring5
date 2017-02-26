package com.example.course;

public class FXNewsProvider {

	private IFXNewsPersister newsPersister;
	
	private IFXNewsListener newsListener;

	public FXNewsProvider(IFXNewsPersister newsPersister, IFXNewsListener newsListener) {
		super();
		this.newsPersister = newsPersister;
		this.newsListener = newsListener;
	}

	public FXNewsProvider() {
		super();
	}

	public IFXNewsPersister getNewsPersister() {
		return newsPersister;
	}

	public void setNewsPersister(IFXNewsPersister newsPersister) {
		this.newsPersister = newsPersister;
	}

	public IFXNewsListener getNewsListener() {
		return newsListener;
	}

	public void setNewsListener(IFXNewsListener newsListener) {
		this.newsListener = newsListener;
	}
	
	
	public void getAndPersistNews() {
		System.out.println("test");
	}
	
}
