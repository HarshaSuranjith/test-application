import { NgModule } from '@angular/core';

import { TestApplicationSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [TestApplicationSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [TestApplicationSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class TestApplicationSharedCommonModule {}
