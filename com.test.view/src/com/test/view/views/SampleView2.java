package com.test.view.views;

import org.eclipse.ui.SelectionListenerFactory;

public class SampleView2 extends SampleView {

	public static final String ID = "com.test.view.views.SampleView2";

	@Override
	protected void addSelectionListener() {
		getSite().getPage().addSelectionListener(SelectionListenerFactory.createVisibleSelfMutedListener(this, this));
	}

}