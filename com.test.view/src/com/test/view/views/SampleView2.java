package com.test.view.views;

import org.eclipse.ui.SelectionListenerFactory;

public class SampleView2 extends SampleView {

	public static final String ID = "com.test.view.views.SampleView2";

	@Override
	protected void addSelectionListener() {
		getSite().getPage().addSelectionListener(SelectionListenerFactory.createVisibleSelfMutedListener(this, this));
	}

	protected String getDescription() {
		return "View 2 selects on everything but not its own selections. When it is hidden"
				+ " it does not receive selections anymore. " + "When it is unhidden the current selection is offered";
	}
}