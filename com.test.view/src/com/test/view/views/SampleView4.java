package com.test.view.views;

import java.util.function.Predicate;

import org.eclipse.ui.SelectionListenerFactory;
import org.eclipse.ui.SelectionListenerFactory.ISelectionModel;

public class SampleView4 extends SampleView {

	public static final String ID = "com.test.view.views.SampleView4";

	@Override
	protected void addSelectionListener() {
		Predicate<ISelectionModel> predicate = new Predicate<SelectionListenerFactory.ISelectionModel>() {

			@Override
			public boolean test(ISelectionModel model) {
				if (model.getCurrentSelectionPart() == SampleView4.this) {
					return false;
				}
				if (!(model.getCurrentSelectionPart() instanceof SampleView)) {
					return false;
				}
				return true;
			}
		};

		getSite().getPage()
				.addSelectionListener(SelectionListenerFactory.createVisibleListener(this, this, predicate));
	}

	protected String getDescription() {
		return "View 4 selects only from its family (other sampleviews) but not from itself.  When it is hidden"
				+ " it does not receive selections anymore. " + "When it is unhidden the current selection is offered";
	}
}