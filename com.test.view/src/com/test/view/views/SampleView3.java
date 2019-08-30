package com.test.view.views;

import static org.eclipse.ui.SelectionListenerFactory.Predicates.adaptsTo;
import static org.eclipse.ui.SelectionListenerFactory.Predicates.emptySelection;
import static org.eclipse.ui.SelectionListenerFactory.Predicates.selectionPartVisible;
import static org.eclipse.ui.SelectionListenerFactory.Predicates.selectionSize;
import static org.eclipse.ui.SelectionListenerFactory.Predicates.selfMute;
import static org.eclipse.ui.SelectionListenerFactory.Predicates.targetPartVisible;

import java.util.function.Predicate;

import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.SelectionListenerFactory;
import org.eclipse.ui.SelectionListenerFactory.ISelectionModel;

public class SampleView3 extends SampleView {

	public static final String ID = "com.test.view.views.SampleView3";

	@Override
	protected void addSelectionListener() {

		Predicate<ISelectionModel> predicate = emptySelection.and(adaptsTo(PlatformObject.class))
				.and(selectionSize(1).and(selfMute).and(selectionPartVisible).and(targetPartVisible));
		getSite().getPage().addSelectionListener(SelectionListenerFactory.createListener(this, predicate));
	}

	protected String getDescription() {
		return "View 3 selects only if a single PlatformObject was selected (e.g. from the navigator) When it is hidden"
				+ " it does not receive selections anymore. "
				+ "When it is unhidden the current selection is offered\n";
	}

}
