import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {

  @Output()
  public submitNumberOutput = new EventEmitter<number>();
  numberConvertorForm: FormGroup = new FormGroup({
    numberToConvert: new FormControl('', [Validators.required])
  });


  constructor() {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.numberConvertorForm.get('numberToConvert').value);
    this.numberConvertorForm.get('numberToConvert').reset();
  }

}
