import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dirictives } from './dirictives';

describe('Dirictives', () => {
  let component: Dirictives;
  let fixture: ComponentFixture<Dirictives>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Dirictives]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Dirictives);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
