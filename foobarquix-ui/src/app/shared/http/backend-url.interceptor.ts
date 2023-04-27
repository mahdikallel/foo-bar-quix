import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from '@angular/common/http';
import {Inject, Injectable} from '@angular/core';
import {Observable} from 'rxjs';

@Injectable({providedIn: 'root'})
export class BackendUrlInterceptor implements HttpInterceptor {
  constructor(@Inject('SERVER_URL') private backendUrl: string) {
  }

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const apiReq = request.clone({url: this.backendUrl + '/' + request.url});
    return next.handle(apiReq);
  }
}
