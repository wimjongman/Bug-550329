package com.test.view.views;

import java.util.function.Predicate;

import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.SelectionListenerFactory;
import org.eclipse.ui.SelectionListenerFactory.ISelectionModel;

public class SampleView3 extends SampleView {

	public static final String ID = "com.test.view.views.SampleView3";

	@Override
	protected void addSelectionListener() {
		Predicate<ISelectionModel> predicate = SelectionListenerFactory
				.createSelectionFilterPredicate(IStructuredSelection.class, 1, PlatformObject.class);
		getSite().getPage()
				.addSelectionListener(SelectionListenerFactory.createVisibleSelfMutedListener(this, this, predicate));
	}

}
