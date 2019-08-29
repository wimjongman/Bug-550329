# Bug-550329
Bug 550329 - Rethink the selection change event handling

https://bugs.eclipse.org/bugs/show_bug.cgi?id=550329

https://git.eclipse.org/r/#/c/148136/


This plug-in contains 4 sample views.

SampleView1 reacts on all selections but not when it is hidden
SampleView2 does the same and does not react on its own selections
SampleView3 acts only reacts on 1 (one) PlatformObject selection in an IStructuredSelection (does not react on multiple selections)

This is taken care of with predicates.
