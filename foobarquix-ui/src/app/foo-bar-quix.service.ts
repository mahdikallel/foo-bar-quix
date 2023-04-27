import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {apiEndpoint} from './shared/enpoint';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {

  constructor(private httpClient: HttpClient) {
  }

  convertNumber(inputNumber: number): Observable<string> {
    return this.httpClient.get<string>(`${apiEndpoint.fooBarQuix}/${inputNumber}`);
  }
}
