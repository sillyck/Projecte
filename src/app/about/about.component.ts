import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  formatLabel(value: number) {
    return value;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
