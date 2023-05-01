import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {apiEndpoint} from './shared/enpoint';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {

  constructor(private httpClient: HttpClient) {
  }

  convertNumber(inputNumber: number): Observable<string> {
    return this.httpClient.get<Result>(`${apiEndpoint.fooBarQuix}/${inputNumber}`)
      .pipe(
        map(value => value.result)
      );
  }
}

export interface Result {
  result: string;
}
