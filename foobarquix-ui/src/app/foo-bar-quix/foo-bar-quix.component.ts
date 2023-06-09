import {Component, OnDestroy, OnInit} from '@angular/core';
import {FooBarQuixService} from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  convertedNumberList: NumberConverted[] = [];

  constructor(private fooBarQuixService: FooBarQuixService) {
  }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.convertNumber(inputNumber)
      .subscribe(value => {
        const numberConverted: NumberConverted = {
          numberToConvert: inputNumber,
          result: value
        };
        this.convertedNumberList.push(numberConverted);
      }, error => console.error(error));
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
