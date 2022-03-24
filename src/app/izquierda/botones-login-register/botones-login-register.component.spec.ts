import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BotonesLoginRegisterComponent } from './botones-login-register.component';

describe('BotonesLoginRegisterComponent', () => {
  let component: BotonesLoginRegisterComponent;
  let fixture: ComponentFixture<BotonesLoginRegisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BotonesLoginRegisterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BotonesLoginRegisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
